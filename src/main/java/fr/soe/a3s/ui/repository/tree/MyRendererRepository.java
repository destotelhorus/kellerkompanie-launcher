package fr.soe.a3s.ui.repository.tree;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

import fr.soe.a3s.dto.sync.SyncTreeDirectoryDTO;
import fr.soe.a3s.dto.sync.SyncTreeNodeDTO;
import fr.soe.a3s.ui.UIConstants;

public class MyRendererRepository extends DefaultTreeCellRenderer implements
		UIConstants {

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean isLeaf, int row,
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, isLeaf,
				row, hasFocus);

		TreePath path = tree.getPathForRow(row);
		if (path != null) {
			SyncTreeNodeDTO syncTreeNodeDTO = (SyncTreeNodeDTO) value;
			setIcon(syncTreeNodeDTO);
		}
		return this;
	}

	private void setIcon(SyncTreeNodeDTO syncTreeNodeDTO) {
		if (!syncTreeNodeDTO.isLeaf()) {
			SyncTreeDirectoryDTO syncTreeDirectoryDTO = (SyncTreeDirectoryDTO) syncTreeNodeDTO;

			if (syncTreeDirectoryDTO.isUpdated()
					|| syncTreeDirectoryDTO.isDeleted()
					|| syncTreeDirectoryDTO.isChanged()) {
				setIcon(new ImageIcon(EXCLAMATION));
			} else if (syncTreeDirectoryDTO.isMarkAsAddon()) {
				setIcon(new ImageIcon(BRICK));
			}

			for (SyncTreeNodeDTO n : syncTreeDirectoryDTO.getList()) {
				if (n.isUpdated() || n.isDeleted()) {
					setIcon(new ImageIcon(EXCLAMATION));
					break;
				} else if (!n.isLeaf()) {
					SyncTreeDirectoryDTO directory = (SyncTreeDirectoryDTO) n;
					if (directory.isChanged()) {
						setIcon(new ImageIcon(EXCLAMATION));
						break;
					}
				}
			}
		}
	}
}
