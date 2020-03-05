package ver1_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSplitPane;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class TextSim_Display extends Calc_Core {

	private JFrame frame;
	private JTextField input_text_area;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextSim_Display window = new TextSim_Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextSim_Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{745, 0};
		gridBagLayout.rowHeights = new int[]{29, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.anchor = GridBagConstraints.NORTH;
		gbc_toolBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		frame.getContentPane().add(toolBar, gbc_toolBar);
		
		Box horizontalBox = Box.createHorizontalBox();
		toolBar.add(horizontalBox);
		
		JButton openfile_btn = new JButton("Open");
		openfile_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		
		horizontalBox.add(openfile_btn);
		openfile_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton save_btn = new JButton("Save");
		save_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		horizontalBox.add(save_btn);
		save_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		horizontalBox.add(clear_btn);
		
		JPanel action_pan = new JPanel();
		action_pan.setBorder(null);
		GridBagConstraints gbc_action_pan = new GridBagConstraints();
		gbc_action_pan.fill = GridBagConstraints.BOTH;
		gbc_action_pan.gridx = 0;
		gbc_action_pan.gridy = 1;
		frame.getContentPane().add(action_pan, gbc_action_pan);
		
		GridBagLayout gbl_action_pan = new GridBagLayout();
		gbl_action_pan.columnWidths = new int[]{745, 0};
		gbl_action_pan.rowHeights = new int[]{0, 0, 0};
		gbl_action_pan.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_action_pan.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		action_pan.setLayout(gbl_action_pan);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		action_pan.add(splitPane, gbc_splitPane);
		
		JPanel input_pan = new JPanel();
		splitPane.setLeftComponent(input_pan);
		input_pan.setLayout(new GridLayout(0, 1, 0, 0));
		
		Box horizontal_box = Box.createHorizontalBox();
		input_pan.add(horizontal_box);
		
		JPanel input_variable_lbl_pan = new JPanel();
		horizontal_box.add(input_variable_lbl_pan);
		input_variable_lbl_pan.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, Color.DARK_GRAY, null));
		input_variable_lbl_pan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel input_variabel_lbl = new JLabel("Stellar Mass (in Sol. units)");
		input_variabel_lbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		input_variable_lbl_pan.add(input_variabel_lbl);
		
		JPanel vignette_pan = new JPanel();
		vignette_pan.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		horizontal_box.add(vignette_pan);
		GridBagLayout gbl_vignette_pan = new GridBagLayout();
		gbl_vignette_pan.columnWidths = new int[]{116, 0};
		gbl_vignette_pan.rowHeights = new int[]{22, 0};
		gbl_vignette_pan.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_vignette_pan.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		vignette_pan.setLayout(gbl_vignette_pan);
		
		JPanel input_variable_pan = new JPanel();
		input_variable_pan.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, null, Color.DARK_GRAY, null));
		GridBagConstraints gbc_input_variable_pan = new GridBagConstraints();
		gbc_input_variable_pan.fill = GridBagConstraints.BOTH;
		gbc_input_variable_pan.gridx = 0;
		gbc_input_variable_pan.gridy = 0;
		vignette_pan.add(input_variable_pan, gbc_input_variable_pan);
		GridBagLayout gbl_input_variable_pan = new GridBagLayout();
		gbl_input_variable_pan.columnWidths = new int[]{116, 0, 0};
		gbl_input_variable_pan.rowHeights = new int[]{22, 0};
		gbl_input_variable_pan.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_input_variable_pan.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		input_variable_pan.setLayout(gbl_input_variable_pan);
		
		input_text_area = new JTextField();
		input_text_area.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		input_text_area.setText("Enter star mass here ...");
		GridBagConstraints gbc_input_text_area = new GridBagConstraints();
		gbc_input_text_area.insets = new Insets(0, 0, 0, 5);
		gbc_input_text_area.fill = GridBagConstraints.BOTH;
		gbc_input_text_area.gridx = 0;
		gbc_input_text_area.gridy = 0;
		input_variable_pan.add(input_text_area, gbc_input_text_area);
		input_text_area.setColumns(10);
		
		JButton input_var_btn = new JButton("Input");
		input_var_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		GridBagConstraints gbc_input_var_btn = new GridBagConstraints();
		gbc_input_var_btn.gridx = 1;
		gbc_input_var_btn.gridy = 0;
		input_variable_pan.add(input_var_btn, gbc_input_var_btn);
		
		JPanel output_pan = new JPanel();
		splitPane.setRightComponent(output_pan);
		output_pan.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, null, Color.DARK_GRAY, null));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		output_pan.add(scrollPane);
		
		JTextArea text_printout_res = new JTextArea();
		text_printout_res.setEditable(false);
		scrollPane.setRowHeaderView(text_printout_res);
		
		JPanel version_pan = new JPanel();
		GridBagConstraints gbc_version_pan = new GridBagConstraints();
		gbc_version_pan.anchor = GridBagConstraints.SOUTHEAST;
		gbc_version_pan.gridx = 0;
		gbc_version_pan.gridy = 1;
		action_pan.add(version_pan, gbc_version_pan);
		GridBagLayout gbl_version_pan = new GridBagLayout();
		gbl_version_pan.columnWidths = new int[]{745, 0};
		gbl_version_pan.rowHeights = new int[]{0, 0};
		gbl_version_pan.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_version_pan.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		version_pan.setLayout(gbl_version_pan);
		
		JLabel version_lbl = new JLabel("Alpha version 1.2.");
		version_lbl.setFont(new Font("Tahoma", Font.ITALIC, 16));
		GridBagConstraints gbc_version_lbl = new GridBagConstraints();
		gbc_version_lbl.gridx = 0;
		gbc_version_lbl.gridy = 0;
		version_pan.add(version_lbl, gbc_version_lbl);
	}


}
