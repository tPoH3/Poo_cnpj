/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author aluno
 */
public class BaseEmpresa {
    public Integer id;
    public String  numero_de_inscricao;
    public String  tipo;
    public String  abertura;
    public String  nome;
    public String  fantasia;
    public String  atividade_principal_nome;
    public String  atividade_principal_code;
    public String  natureza_juridica;
    public String  logradouro;
    public String  numero;
    public String  complemento;
    public String  cep;
    public String  bairro;
    public String  municipio;
    public String  uf;
    public String  email;
    public String  telefone;
    public String  entidade_federativa_responsavel;
    public String  situacao;
    public String  dt_situacao_cadastral;
    public String  situacao_especial;
    public String  data_situacao_especial;
    public String  capital_social;
    public String  ie_origem;
    public String  created_at;
    public String  updated_at;
    
    
   
     private String request(String cnpj)
    {
        String json;        

        try {
            URL url = new URL("https://sisdel.com.br/api/hub/cnpjHub/"+ cnpj);
           
            URLConnection urlConnection = url.openConnection();
           
            InputStream is = urlConnection.getInputStream();
           
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
           
            json = jsonSb.toString();
           
            // JOptionPane.showMessageDialog(null, json);
           
           return json;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     

/////////////////////////////////////////////////////////////////////////////////////////     
    public void consultaCnpj(String cnpj){
       
        String resposta = request(cnpj);
       
        resposta = resposta.replaceAll("[{},:]", "");
       
        resposta = resposta.replaceAll("\"", "\n");        
       
        String array[] = new String[103];
       
        array = resposta.split("\n");
           
//        JOptionPane.showMessageDialog(null, array);
         
         this.setId(2);
         this.setNumero_de_inscricao(array[5]);
         this.setTipo(array[9]);
         this.setAbertura(array[13]);
         this.setNome(array[19]);
         this.setFantasia(array[21]);
         this.setAtividade_principal_nome(array[25]);
         this.setAtividade_principal_code(array[29]);
         this.setNatureza_juridica(array[3]);
         this.setLogradouro(array[37]);
         this.setNumero(array[41]);
         this.setComplemento(array[45]);
         this.setCep(array[49]);
         this.setBairro(array[53]);
         this.setMunicipio(array[57]);
         this.setUf(array[61]);
         this.setEmail(array[65]);
         this.setTelefone(array[69]);
         this.setEntidade_federativa_responsavel(array[74]);
         this.setSituacao(array[77]);
         this.setDt_situacao_cadastral(array[81]);
         this.setSituacao_especial(array[85]);
         this.setData_situacao_especial(array[89]);
         this.setCapital_social(array[93]);
         this.setIe_origem(array[96]);
         this.setCreated_at(array[99]);
         this.setUpdated_at(array[103]);
         
         
    }
    
    
    
///////////////////////////////////////////////////////////////////////////////////////    
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero_de_inscricao(String numero_de_inscricao) {
        this.numero_de_inscricao = numero_de_inscricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public void setAtividade_principal_nome(String atividade_principal_nome) {
        this.atividade_principal_nome = atividade_principal_nome;
    }

    public void setAtividade_principal_code(String atividade_principal_code) {
        this.atividade_principal_code = atividade_principal_code;
    }

    public void setNatureza_juridica(String natureza_juridica) {
        this.natureza_juridica = natureza_juridica;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEntidade_federativa_responsavel(String entidade_federativa_responsavel) {
        this.entidade_federativa_responsavel = entidade_federativa_responsavel;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setDt_situacao_cadastral(String dt_situacao_cadastral) {
        this.dt_situacao_cadastral = dt_situacao_cadastral;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public void setData_situacao_especial(String data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public void setCapital_social(String capital_social) {
        this.capital_social = capital_social;
    }

    public void setIe_origem(String ie_origem) {
        this.ie_origem = ie_origem;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    public  int primeiroDigito(int[] numeros){

        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma = 0;
        int resultado = 0;

        for (int i = 0; i < multiplicadores.length; i++) 
        {
            soma += numeros[i] * multiplicadores[i];
        }

        resultado = 11 - (soma % 11);

        if ((resultado == 10) || (resultado == 11)){
            return 0;
        }
            return resultado;
    }

    public  int segundoDigito(int[] numeros){
        
        int[] multiplicadores = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        int soma = 0;
        int resultado = 0;

        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];   
        }

        resultado = 11 - (soma % 11);

        if ((resultado == 10) || (resultado == 11)){
            return 0;
        }
            return resultado;
    }

    public  boolean validar(String cnpj) {

        if (cnpj.length() != 14) 
        {
            return false;
        }

        int[] numeros = new int[14];

        for (int i = 0; i < 14; i++) {
            numeros[i] = Integer.parseInt(cnpj.substring(i, i + 1));
        }

        if(primeiroDigito(numeros) != numeros[12] || segundoDigito(numeros) != numeros[13]){
            return false;
        }
            return true;
    } 
}
