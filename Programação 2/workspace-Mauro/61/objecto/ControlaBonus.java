package objecto;

public class ControlaBonus {
private double bonusTotal;

//Todas as empresas começam com 0
public ControlaBonus() {
	this.bonusTotal = 0;
}
/*public double calculaBonus(Vendedor v, Administrador a) {
	
	return bonusTotal=bonusTotal+v.bonus()+a.bonus();
}*/
public double calculaBonus(Funcionario f) {
	
	return bonusTotal=bonusTotal+f.bonus();

}
@Override
public String toString() {
	return "ControlaBonus [bonusTotal=" + bonusTotal + "]";
}

}
