package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.println("how many products ? ");
        int j = sc.nextInt();

        for(int i =0; i<j;i++){
            System.out.println("Product 1 data: ");
            System.out.println("Common, Used or Imported (c, u, i) ?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if(ch == 'i'){
                System.out.println("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Produto emp = new ProdutoImportado(name, price, customsFee);
                list.add(emp);
            }
            if(ch == 'u'){
                System.out.println("Manufacture Date: ");
                String date = sc.next();
                Produto emp = new UsedProduct(name, price, date);
                list.add(emp);
            }
            else{
                Produto emp = new Produto(name,price);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Price Tags: ");
        for(Produto emp : list){
            System.out.println(emp.priceTag());
        }
    }
}
