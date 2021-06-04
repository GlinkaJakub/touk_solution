package com.glinka.touk_task.service;

import com.glinka.touk_task.dto.TicketRequestDto;
import com.glinka.touk_task.dto.TicketResponseDto;

public interface ITicketService {

    TicketResponseDto save(TicketRequestDto ticketRequestDto);

}
