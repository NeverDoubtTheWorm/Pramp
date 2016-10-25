#Flatten a Dictionary

Given a dictionary, write a function to flatten it. Consider the following input/output scenario for better understanding:

Input:

    {
      'Key1': '1',
      'Key2': {
        'a' : '2',
        'b' : '3',
        'c' : {
          'd' : '3',
          'e' : '1'
          }
        }
    }

Output:

    {
      'Key1': '1',
      'Key2.a': '2',
      'Key2.b' : '3',
      'Key2.c.d' : '3',
      'Key2.c.e' : '1'
    }
