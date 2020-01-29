package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager
                .getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                        "armansh","arman4563");
        Scanner input = new Scanner(System.in);
        int choose1,choose2,choose3;
        String name1,name2,name3,name4,name5,menuback;
        int entrance1,entrance2,entrance3,entrance4,entrance5;
        double average1,average2,average3,average4,average5;
        System.out.println("\n\t\tDataBase");
        while (true){
            System.out.println("\n1)Insert users\n2)Update user\n3)Delete user\n4)Show all the users");
            choose1 = input.nextInt();
            switch (choose1) {

                case 1 :{
                    PreparedStatement preparedStatement = connection
                            .prepareStatement("INSERT INTO students (id,name,entrance,average) " +
                                    "VALUES (?,?,?,?)");
                    preparedStatement.setLong(1, 1);
                    preparedStatement.setString(2, "Ahmad");
                    preparedStatement.setLong(3, 97);
                    preparedStatement.setDouble(4, 18.35);
                    preparedStatement.executeUpdate();

                    preparedStatement.setLong(1, 2);
                    preparedStatement.setString(2, "Mamad");
                    preparedStatement.setLong(3, 96);
                    preparedStatement.setDouble(4, 13);
                    preparedStatement.executeUpdate();

                    preparedStatement.setLong(1, 3);
                    preparedStatement.setString(2, "Armin");
                    preparedStatement.setLong(3, 95);
                    preparedStatement.setDouble(4, 19);
                    preparedStatement.executeUpdate();

                    preparedStatement.setLong(1, 4);
                    preparedStatement.setString(2, "Sorena");
                    preparedStatement.setLong(3, 97);
                    preparedStatement.setDouble(4, 16.75);
                    preparedStatement.executeUpdate();

                    preparedStatement.setLong(1, 5);
                    preparedStatement.setString(2, "Hamid");
                    preparedStatement.setLong(3, 98);
                    preparedStatement.setDouble(4, 11.5);
                    preparedStatement.executeUpdate();
                    System.out.println(" 5 Users Were Inserted...");
                    /*System.out.print("\n\tBACK TO MENU?(yes/no):");
                    menuback = input.next();
                    if (menuback.equals("yes"));
                    else if (menuback.equals("no")){
                        break;
                    }*/
                    break;
                }

                case 2:{
                    System.out.println("\n1)user 1\n2)user 2\n3)user 3\n4)user 4\n5)user 5");
                    choose2 = input.nextInt();
                    switch (choose2){

                        case 1:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("UPDATE students SET name =?, entrance =?, average =? " +
                                            "WHERE id =?");
                            System.out.print("Editing user 1 name: ");
                            name1 = input.next();
                            preparedStatement.setString(1,name1);
                            System.out.print("Editing user 1 entrance: ");
                            entrance1 = input.nextInt();
                            preparedStatement.setLong(2,entrance1);
                            System.out.print("Editing user 1 average: ");
                            average1 = input.nextDouble();
                            preparedStatement.setDouble(3,average1);
                            preparedStatement.setLong(4,1);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was updated successfully ");
                            break;
                        }

                        case 2:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("UPDATE students SET name =?, entrance =?, average =? " +
                                            "WHERE id =?");
                            System.out.print("Editing user 2 name: ");
                            name2 = input.next();
                            preparedStatement.setString(1,name2);
                            System.out.print("Editing user 2 entrance: ");
                            entrance2 = input.nextInt();
                            preparedStatement.setLong(2,entrance2);
                            System.out.print("Editing user 2 average: ");
                            average2 = input.nextDouble();
                            preparedStatement.setDouble(3,average2);
                            preparedStatement.setLong(4,2);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was updated successfully ");
                            break;
                        }

                        case 3:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("UPDATE students SET name =?, entrance =?, average =? " +
                                            "WHERE id =?");
                            System.out.print("Editing user 3 name: ");
                            name3 = input.next();
                            preparedStatement.setString(1,name3);
                            System.out.print("Editing user 3 entrance: ");
                            entrance3 = input.nextInt();
                            preparedStatement.setLong(2,entrance3);
                            System.out.print("Editing user 3 average: ");
                            average3 = input.nextDouble();
                            preparedStatement.setDouble(3,average3);
                            preparedStatement.setLong(4,3);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was updated successfully ");
                            break;
                        }

                        case 4:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("UPDATE students SET name =?, entrance =?, average =? " +
                                            "WHERE id =?");
                            System.out.print("Editing user 4 name: ");
                            name4 = input.next();
                            preparedStatement.setString(1,name4);
                            System.out.print("Editing user 4 entrance: ");
                            entrance4 = input.nextInt();
                            preparedStatement.setLong(2,entrance4);
                            System.out.print("Editing user 4 average: ");
                            average4 = input.nextDouble();
                            preparedStatement.setDouble(3,average4);
                            preparedStatement.setLong(4,4);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was updated successfully ");
                            break;
                        }

                        case 5:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("UPDATE students SET name =?, entrance =?, average =? " +
                                            "WHERE id =?");
                            System.out.print("Editing user 5 name: ");
                            name5 = input.next();
                            preparedStatement.setString(1,name5);
                            System.out.print("Editing user 5 entrance: ");
                            entrance5 = input.nextInt();
                            preparedStatement.setLong(2,entrance5);
                            System.out.print("Editing user 5 average: ");
                            average5 = input.nextDouble();
                            preparedStatement.setDouble(3,average5);
                            preparedStatement.setLong(4,5);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was updated successfully ");
                            break;
                        }
                    }
                    break;
                }

                case 3:{
                    System.out.println("\n1)user 1\n2)user 2\n3)user 3\n4)user 4\n5)user 5");
                    choose3 = input.nextInt();
                    switch (choose3){

                        case 1:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("DELETE FROM students WHERE id=?");
                            preparedStatement.setLong(1,1);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was deleted !!");
                            break;
                        }

                        case 2:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("DELETE FROM students WHERE id=?");
                            preparedStatement.setLong(1,2);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was deleted !!");
                            break;
                        }

                        case 3:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("DELETE FROM students WHERE id=?");
                            preparedStatement.setLong(1,3);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was deleted !!");
                            break;
                        }

                        case 4:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("DELETE FROM students WHERE id=?");
                            preparedStatement.setLong(1,4);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was deleted !!");
                            break;
                        }

                        case 5:{
                            PreparedStatement preparedStatement = connection
                                    .prepareStatement("DELETE FROM students WHERE id=?");
                            preparedStatement.setLong(1,5);
                            preparedStatement.executeUpdate();
                            System.out.println("\n\t* User was deleted !!");
                            break;
                        }
                    }
                    break;
                }

                case 4:{
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()){
                        System.out.println(resultSet.getLong("id"));
                        System.out.println(resultSet.getString("name"));
                        System.out.println(resultSet.getLong("entrance"));
                        System.out.println(resultSet.getDouble("average"));
                    }
                    break;
                }

                default:{
                    System.out.println("ENTER CORRECT NUMBER !");
                }
            }
        }
    }
}
