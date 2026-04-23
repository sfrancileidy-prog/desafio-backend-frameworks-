package com.francileidy.java_springboot.services.interfaces;



import java.util.List;

import com.francileidy.java_springboot.dtos.UsuarioDto;



public interface UsuarioServiceInterface {
 
  UsuarioDto salvar(UsuarioDto user);

  List<UsuarioDto> listar();
  
}