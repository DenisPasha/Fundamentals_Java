package finalExam;

import java.util.*;

public class P03MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumOfMessages=Integer.parseInt(scanner.nextLine());

        String commands = scanner.nextLine();
        Map<String, List<Integer>>map=new LinkedHashMap<>();

        while (!commands.contains("Statistics")){

            String[] commandArr=commands.split("=");
            String mainCommand= commandArr[0];

            if (mainCommand.equals("Add")){

                String userName = commandArr[1];
                int  sendMessages = Integer.parseInt(commandArr[2]);
                int  receivedMessages = Integer.parseInt(commandArr[3]);

                if (!map.containsKey(userName)){
                    map.put(userName,new ArrayList<>());
                    map.get(userName).add(sendMessages);
                    map.get(userName).add(receivedMessages);
                }

            } else if (mainCommand.equals("Message")) {
                String sender=commandArr[1];
                String receiver=commandArr[2];

                if (map.containsKey(sender) && map.containsKey(receiver)){
                    //increasing senders sended messages
                 int sendersSendedMessages = map.get(sender).get(0);
                 map.get(sender).set(0,sendersSendedMessages+1);

                 // increasing receivers received messages
                    int receiversReceivedMessages = map.get(receiver).get(1);
                    map.get(receiver).set(1,receiversReceivedMessages+1);


                    int totalSendersMessages = map.get(sender).get(0) + map.get(sender).get(1);
                    int totalReceiversMessages = map.get(receiver).get(0) + map.get(receiver).get(1);

                    if (totalSendersMessages >= maxNumOfMessages){
                        System.out.printf("%s reached the capacity!%n",sender);
                        map.remove(sender);
                    }
                    if (totalReceiversMessages >= maxNumOfMessages) {
                        System.out.printf("%s reached the capacity!%n",receiver);
                        map.remove(receiver);
                    }
                }


            }else if (mainCommand.equals("Empty")) {

                String userName = commandArr[1];

                if (userName.equals("All")){
                    map.clear();
                }else {
                    map.remove(userName);
                }
            }


            commands=scanner.nextLine();
        }

        System.out.printf("Users count: %d%n",map.size());
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int totalMessagesOfUser = entry.getValue().get(0) + entry.getValue().get(1);
            System.out.printf("%s - %d%n",entry.getKey(),totalMessagesOfUser);
        }

    }
}
