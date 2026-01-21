package com.fitnesstracker;

class BubbleSort {

    static void sort(User[] users) {
        int n = users.length;

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (users[j].steps < users[j + 1].steps) 
                {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }
}
