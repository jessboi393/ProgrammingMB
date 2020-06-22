x = True
while(x == True):
    name = input("What is your name? ")
    print("Your name is " + name)

    age = int(input("How old are you? "))
    print("You are ",age," year(s) old ")

    
    print("I can count up to your name. Watch ")
    for y in range(0,age+1):
        print(y)
    ans = input("Would you like to play again? (y/n) ")





    if ans == 'y':
        x = True
    elif ans == 'n':
        x = False
    else:
        x = True
