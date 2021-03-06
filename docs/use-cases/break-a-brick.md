# Break a brick

**Scope:** Gameplay

**Level:** user goal

**Primary Actor:** User

**Stakeholders and interests:**
- User: Wants to destroy all the blocks in order to win the game

**Preconditions:** User is playing.  
**Postconditions:** Brick is broken and removed from Board

**Main Success Scenario:**
1. Ball is moving around on the screen and heads towards the bottom of the screen
2. User moves the paddle to be directly below the ball: Include Move the Paddle
3. The ball hits the paddle
4. The Game changes the trajectory of the ball 
5. The ball hits a brick
6. The Game removes the brick

**Extensions:**
* *a. The program fails.
	* 1. The user runs the game again.
* *3a. The paddle misses the ball and the balls falls off screen
	* 1. The player loses a life
	* 2. Game shows another ball (if the use still has a life) and the game continues
* *4a. The ball misses all bricks
	* 1. The ball reflects back to the player and we go back to step 1 in the main scenario
* *5a. The ball is a half-metal brick type and the ball hits it from the metal side
	* 1. The ball reflects back normally and the brick is not destroyed

**Special Requirements:**
- none

**Technology and data variations:**
- none

**Frequency of occurence:**

Nearly continuous