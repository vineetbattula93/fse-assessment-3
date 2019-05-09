# Assessment 3

**READ THIS DOCUMENT COMPLETELY BEFORE STARTING THE ASSESSMENT**

## Overview
After a year or so, the now wildy successful **Ali Snobba** has come to Cognizant for technical help once again.  Cognizant has now been retained to help dramatically modernize its marketing systems and online presence. 

Given that “you make what you measure”, the first phase of the engagement is to greatly improve their user tracking capabilities, to see what people are doing on their site.

Although in real life it’s likely you’d integrate a third-party vendor that specializes in this, let’s say you’re doing it in-house.

## Your Task
- Prototype a simple UserEvent service. 

## Time to Complete
- You have 1 hour and 45 minutes to complete this assessment. (Ends at 2:45pm)
- Once you are done, take a break and be back in the room at 3:00pm sharp for assessment 4.

## Stories
- As an end-user (i.e., using the web reservation app), my user actions are reported in the background.
- As a reporting user, I can request a list of user events (for all users) that took place within a given timeframe.
- As a reporting user, I can request a list of all user events for a single user, specified by their user id.

### Example Data Format for a UserEvent
```
{
    type: 'promotion-viewed', // i.e., the user clicked on a "house ad" (an internal ad) on the site
    userId: '1b468f7d-79e8-40c1-80a2-0dd7226e7771', // let's assume this system uses GUIDs
    timestamp: 1544401072, // unix epoch time
    context: 'homepage.topnav', // which view did this event take place in?
}
```
## Technical requirements
- Use Spring and Spring REST services.
- Use MongoDB for the repository.
- Write clean, modularized code.
- Make small, meaningful git commits 
- Write unit tests

## Notes
- There is NOT a front-end aspect to this. Although this system will eventually require a client-side library in order to work, that’s out of scope.
- You do not need to directly model users or promotions, etc -- just user events.
- ONLY implement what is specified above. 
- If you aren’t sure whether something is in scope, ask!

## How to Submit Your Work
- **Fork** this repo to your own github account.
- Check out your new repo into your IDE.
- Commit your code often and when you're done with the assessment.
- Don't change the name of the repo.

## Grading Rubric
- 5% - Project completed.
- 10% - Code compiles, builds and runs.
- 10% - Unit tests passed.
- 15% - Followed instructions fully.
- 20% - Unit tests written.
- 20% - Coding best practices used.
- 20% - Implemented all stories.
