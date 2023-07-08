/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Empresa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
/*
        Cep cep = new Cep();

        System.out.println("Digite o seu cep aqui:");
        
        String formCep = teclado.next();
        
        
        cep.consultaCep(formCep);
        
        System.out.println(cep.bairro);
  */      
        
        BaseEmpresa empresacnpj = new BaseEmpresa();
        
        System.out.println("Digite o cnpj da sua empresa aqui:");
        
        String cnpj = teclado.nextLine();
        
        empresacnpj.consultaCnpj(cnpj);
        
        if(empresacnpj.validar(cnpj))
        {
            
            System.out.println("CNPJ valido!!!");
            empresacnpj.consultaCnpj(cnpj);
            
            
        System.out.println(empresacnpj.id);
        System.out.println(empresacnpj.numero_de_inscricao);
        System.out.println(empresacnpj.tipo);
        System.out.println(empresacnpj.abertura);
        System.out.println(empresacnpj.nome);
        System.out.println(empresacnpj.fantasia);
        System.out.println(empresacnpj.atividade_principal_nome);
        System.out.println(empresacnpj.atividade_principal_code);
        System.out.println(empresacnpj.natureza_juridica);
        System.out.println(empresacnpj.logradouro);
        System.out.println(empresacnpj.numero);
        System.out.println(empresacnpj.complemento);
        System.out.println(empresacnpj.cep);
        System.out.println(empresacnpj.bairro);
        System.out.println(empresacnpj.municipio);
        System.out.println(empresacnpj.uf);
        System.out.println(empresacnpj.email);
        System.out.println(empresacnpj.telefone);
        System.out.println(empresacnpj.entidade_federativa_responsavel);
        System.out.println(empresacnpj.situacao_especial);
        System.out.println(empresacnpj.data_situacao_especial);
        System.out.println(empresacnpj.capital_social);
        System.out.println(empresacnpj.ie_origem);
        System.out.println(empresacnpj.created_at);
        System.out.println(empresacnpj.updated_at);
        }else{
            System.out.println("CNPJ invalido!!!!");
        }
    }
}
