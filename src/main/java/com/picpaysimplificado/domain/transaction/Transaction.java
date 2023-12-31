package com.picpaysimplificado.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.picpaysimplificado.domain.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class Transaction {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private Long Id;
	private BigDecimal amount;
	
	@ManyToOne
	@JoinColumn(name="sender_id")
	private User sender;
	@ManyToOne
	@JoinColumn(name="receiver_id")
	private User receiver;
	private LocalDateTime timestamp;
	

}
