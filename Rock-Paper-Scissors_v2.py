#Rock-Paper-Scissors - Game
import random

#Figures
def P_rock():
    {
print("""
Player:
    ________
---'  ______)
       (______)
       (______)
       (_____)
---.___(____)
""")
    }

def P_paper():
    {
print("""
Player:
    _______
---'   ____)______
          ________)
          ________)
         ________)
---.___________)
""")
    }

def P_scissors():
    {
print("""
Player:
    _______
---'   ____)_______
          _________)
       ___________)
      (_____)
---.__(____)
""")
    }
def B_rock():
    {
print("""               Bot :
                    _________
                   (_______  '---
                  (_____)
                  (_____)
                   (____)
                    (___)___.---
""")
    }
def B_paper():
    {
print("""               Bot:
                      _________
                 ____(____     '---
                (______
                (_______
                 (_______
                   (___________.---
""")
    }
def B_scissors():
    {
print("""                Bot:
                       _______
                 _____(____   '---
                (_______
                (__________
                     (_____)
                      (____)__.---
""")
    }

#code
def BotRoll():
    return random.randint(1,3)

def Player_Roll():
    #Player Code
    print("""
          What do you what to throw?
          1. Rock
          2. Paper
          3. Scissor
          """)
    P_throw=int(input(" "))
    if P_throw==1:
        P_rock()
    elif P_throw==2:
        P_paper()
    elif P_throw==3:
        P_scissors()
    elif P_throw!=1|2|3:
        print("Invalid Throw. Try again.")
        Player_Roll()
    #Bot code
    roll=BotRoll()
    if roll==1:
        B_rock()
    elif roll==2:
        B_paper()
    elif roll==3:
        B_scissors()
    #condition
    if P_throw==1 and roll==2:
        print("---Bot Wins---")
    elif P_throw==1 and roll==3:
        print("---Player Wins---")
    elif P_throw==2 and roll==1:
        print("---Player Wins---")
    elif P_throw==2 and roll==3:
        print("---Bot Wins---")
    elif P_throw==3 and roll==1:
        print("---Bot Wins---")
    elif P_throw==3 and roll==2:
        print("---Player Wins---")
    elif P_throw==roll:
        print("---Tie---")
        Player_Roll()

def start_play():
    while True:
        print("Start Playing ? ")
        opt=input("(y/n) : ")
        if opt=="y":
            Player_Roll()
        if opt=="n":
            return False
start_play()