package de.tu_bs.cs.isf.e4cf.parts.project_explorer.view;

import de.tu_bs.cs.isf.e4cf.core.file_structure.FileTreeElement;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeView;

public class ProjectExplorerView {
	
	@FXML public TreeView<FileTreeElement> projectTree;
	@FXML public MenuItem ctxNewFolder;

}
