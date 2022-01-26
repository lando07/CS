Psuedo Code:

while player still wants to play
    Deal 2 cards random from 2 to 11 for both dealer and player
    if sum is over 21, redeal cards secretly
    store each sum in varible
    display total for player's hand
    ask if player wants to hit
    while player wants to hit
        Player takes a turn
        display number drawn then add to sum
        if over 21 then break
    show dealer numbers
    while Dealer has less than 15
        Dealer takes a hit
        if over 21 then break
    check if dealer busted
        print dealer busted
    check if player busted
        print player busted
    Find out who won based on if player busted or if they are closer to 21 than the dealer
***Safeguards will be applied when possible around the program
Aces = 11
Face cards = 10
Numbered cards = numbered amount
You and the computer will be given 2 cards to start.
Cards will be from 2 to eleven
Dealer will hit if sum of their cards are below 14(take another card)
Dealer will stay once sum of cards is above 15
Try to get as close to 21 without going over
Player can hit as many times as possible until bust(over 21)
Player auto wins if dealer busts