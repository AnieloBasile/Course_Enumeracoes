package entities.enums;

public enum OrderStatus {
	//tipos(constantes) do meu pacote enumerados
	PENDING_PAYMENT, //Pagamento pendente (aguardando pagamento)
	PROCESSING,      //Em processamento
	SHIPPED,         //Enviado (em transporte)
	DELIVERED;       //Entregue
}
