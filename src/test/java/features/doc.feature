Feature: Automate TestAUI Application

Scenario: TC001_DragAndDrop

Given Launch Chromebrowser and load url
When click the Droppable button
Then its navigate the droppable page
When switching to frame
When drag and drop action code is performing
And switch back to main frame
Then its navigate the droppable page
When click the sortable button
Then its navigate the sortable page
When verification of the title page
And close browser 

Scenario: TC002_Draggable

Given Launch Chromebrowser and load url
When click the draggable button
Then its navigated the draggable page
When switching to frame
When drag and pull action code is performing
And switch back to main frame
And close browser

Scenario: TC003_KeyDown

Given Launch Chromebrowser and load url
When click the selectable button
Then its navigated the selectable page
When switching to frame
And click the item numbers
And switch back to main frame
And close browser




