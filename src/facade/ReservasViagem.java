package facade;

public class ReservasViagem { 

	protected ReservaAviao rreservaAviao;
	protected ReservaCarro rreservaCarro;
	protected ReservaHotel rreservaHotel;
	protected Pagamentos rpagamentos;

	public void ReservaProdutos() {

		rreservaAviao = new ReservaAviao();
		rreservaAviao.compania();

		rreservaCarro = new ReservaCarro();
		rreservaCarro.reservaCarro();

		rreservaHotel = new ReservaHotel();
		rreservaHotel.reservaHotel();

		rpagamentos = new Pagamentos();
		rpagamentos.pagamento();
	}
}