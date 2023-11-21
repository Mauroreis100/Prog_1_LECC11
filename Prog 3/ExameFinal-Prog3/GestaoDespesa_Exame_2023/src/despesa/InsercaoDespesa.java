package despesa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

public class InsercaoDespesa implements ActionListener {
	private JFrame fr_inserir,fr_visualizar,fr_categoria,fr_filtrado;
	private JTextField tf_descricao, tf_valor, tf_data;
	private DateTimeFormatter dtf;
	private JComboBox cbCategoria, cbDia, cbMes, cbAno;
	private JButton bt_inserir;
	private JLabel lb_descricao, lb_valor, lb_data, lb_categoria;
	private String categorias[] = { "Alimentação", "Transporte", "Lazer", "Outros" };
	private String dia[] = new String[31];
	private String mes[] = new String[12];
	private String ano[] = new String[10];
	
	Vector lista = new Vector();
	Despesa despesa = new Despesa();

	private JButton bt_adicionar, bt_visualizar, bt_filtrar;
	private JTable despesa_table;
	private JPanel jp_buttons,jp_tabela;

	private Vector insercao = new Vector();
	
	public InsercaoDespesa() {
		fr_inserir=new JFrame("Inserir Despesa");
		lb_descricao = new JLabel("Descrição");
		lb_valor = new JLabel("Valor");
		lb_data = new JLabel("Data");
		lb_categoria = new JLabel("Categoria");

		tf_descricao = new JTextField(5);
		tf_valor = new JTextField(5);
		for (int i = 0; i < 31; i++) {
			dia[i] = (i + 1) + "";
		}
		for (int i = 0; i < 12; i++) {
			mes[i] = (i + 1) + "";
		}
		int anoThis = 2022;
		for (int i = 0; i <= 9; i++) {
			ano[i] = (anoThis) + "";
			anoThis++;
		}
		cbDia = new JComboBox(dia);
		cbMes = new JComboBox(mes);
		cbAno = new JComboBox(ano);

		cbCategoria = new JComboBox(categorias);

		bt_inserir = new JButton("INSERIR");
		// ---------------------------------------
		
		fr_inserir.setSize(700, 400);
		fr_inserir.setLayout(new GridLayout(10, 2));
		// ----------------------------------------
		bt_inserir.addActionListener(this);
		fr_inserir.add(lb_descricao);
		fr_inserir.add(tf_descricao);
		fr_inserir.add(lb_categoria);
		fr_inserir.add(cbCategoria);
		fr_inserir.add(lb_valor);
		fr_inserir.add(tf_valor);
		fr_inserir.add(lb_data);
		fr_inserir.add(new JLabel(""));
		fr_inserir.add(new JLabel("Dia"));
		fr_inserir.add(cbDia);
		fr_inserir.add(new JLabel("Mes"));
		fr_inserir.add(cbMes);
		fr_inserir.add(new JLabel("Ano"));
		fr_inserir.add(cbAno);

		fr_inserir.add(bt_inserir);
		fr_inserir.setVisible(true);
	}
	
	public void VisualizarDespesa(Vector lista) {
		fr_visualizar=new JFrame("Gestão de Despesas Pessoais");
		bt_adicionar = new JButton("Adicionar Despesas");
		bt_visualizar = new JButton("Visualizar Despesas");
		bt_filtrar = new JButton("Filtrar por Categoria");
		

		despesa_table = new JTable();
		jp_buttons = new JPanel();
		jp_tabela=new JPanel();
		// ---------------------------------------

		fr_visualizar.setSize(100, 400);
		fr_visualizar.setLayout(new BorderLayout());
		jp_tabela.setLayout(new FlowLayout());
		// ----------------------------------------
		bt_adicionar.addActionListener(this);
		bt_visualizar.addActionListener(this);
		bt_filtrar.addActionListener(this);
		
		jp_buttons.add(bt_adicionar);
		jp_buttons.add(bt_visualizar);
		jp_buttons.add(bt_filtrar);
		jp_tabela.add(new JLabel("Descrição"));
		jp_tabela.add(new JLabel("Categoria"));
		jp_tabela.add(new JLabel("Valor"));
		jp_tabela.add(new JLabel("Data"));
		for(int i=0;i<lista.size();i++) {
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getDescrição()));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getCategoria()));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getValor()+""));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getData()));
		}
		
		fr_visualizar.add(jp_tabela,BorderLayout.CENTER);
		fr_visualizar.add(jp_buttons, BorderLayout.SOUTH);

		fr_visualizar.setVisible(true);
	}
	
	public void Filtrar(Vector lista,String categoria) {
		fr_filtrado=new JFrame("Filtro");
		bt_adicionar = new JButton("Adicionar Despesas");
		bt_visualizar = new JButton("Visualizar Despesas");
		bt_filtrar = new JButton("Filtrar por Categoria");
		

		despesa_table = new JTable();
		jp_buttons = new JPanel();
		jp_tabela=new JPanel();
		// ---------------------------------------

		fr_filtrado.setSize(1000, 400);
		fr_filtrado.setLayout(new BorderLayout());
		jp_tabela.setLayout(new GridLayout(lista.size(),4));
		// ----------------------------------------
		bt_adicionar.addActionListener(this);
		bt_visualizar.addActionListener(this);
		bt_filtrar.addActionListener(this);
		
		jp_buttons.add(bt_adicionar);
		jp_buttons.add(bt_visualizar);
		jp_buttons.add(bt_filtrar);
		jp_tabela.add(new JLabel("Descrição"));
		jp_tabela.add(new JLabel("Categoria"));
		jp_tabela.add(new JLabel("Valor"));
		jp_tabela.add(new JLabel("Data"));
		for(int i=0;i<lista.size();i++) {
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getDescrição()));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getCategoria()));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getValor()+""));
			jp_tabela.add(new JLabel(((Despesa)lista.get(i)).getData()));
		}
		
		fr_filtrado.add(jp_tabela,BorderLayout.CENTER);
		fr_filtrado.add(jp_buttons, BorderLayout.SOUTH);

		fr_filtrado.setVisible(true);
	}

	public static void main(String[] args) {
		new InsercaoDespesa();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ((e.getSource() == bt_inserir)) {
			if (!(tf_descricao.getText().isEmpty() && tf_valor.getText().isEmpty())) {
				despesa.setDescrição(tf_descricao.getText());
				String categoriaSelecionada = cbCategoria.getSelectedItem().toString();
				despesa.setCategoria(categoriaSelecionada);
				try {
					
					despesa.setValor(Double.parseDouble(tf_valor.getText()));
				}catch(Exception e1) {
					System.out.println(e1.getMessage()+"valores");
				}
				String dia = cbDia.getSelectedItem().toString();
				String mes = cbMes.getSelectedItem().toString();
				String ano = cbAno.getSelectedItem().toString();
				String data = dia + "-" + mes + "-" + ano;
				despesa.setData(data);
				JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
				lista.add(despesa);
				VisualizarDespesa(lista);
				fr_inserir.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "CAMPOS VAZIOS");
			}

		}
		if (e.getSource() == bt_filtrar) {
			fr_categoria=new JFrame();
			fr_categoria.setLayout(new FlowLayout());
			fr_categoria.setSize(500,200);
			fr_categoria.add(new JLabel("Seleccione a categoria"));
			fr_categoria.add(new JComboBox(categorias));
			fr_categoria.add(new JButton("Filtrar"));
			fr_categoria.setVisible(true);
		}
		if (e.getSource() == bt_adicionar) {
			fr_inserir.setVisible(true);
			fr_visualizar.setVisible(false);
		}
	}
}
