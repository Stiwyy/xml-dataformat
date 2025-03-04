package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dcb = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dcb.newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/files/adressen.xml");

            NodeList nodeList = document.getElementsByTagName("adresse");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getTextContent());
                }
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}