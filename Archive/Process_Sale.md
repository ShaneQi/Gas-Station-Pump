# Process Sale

**Scope:** Gas station pump system

**Level:** User goal

**Primary Actor:** Customer

**Stakeholders and Interests:**

- Customer: Wants purchase and fast service with minimal effort. Wants easily visible display of amount of gas and price.
- Pump system: Wants accurate, fast entry, and no payment errors.
- Company: Wants to accurately record transaction and satisfy customer interests. Wants to ensure that Payment Authorization Service payment receivables are recorded. Wants some fault tolerance to allow sales capture even if server components(e.g., remote credit validation) are unavailable. Wants automatic and fast update of accounting and inventory.
- Government Tax Agencies: Want to collect tax from every sale. May be multiple agencies, such as national, state, and county.
- Payment Authorization Service: Wants to receive digital authorization requests in the correct format and protocol. Wants to accurately account for their payables to the store.

**Preconditions:** The pump machine works well.

**Success Guarantee:** Sale is saved. Tax is correctly calculated. Account and Inventory are updated. Commissions recorded. Receipt is generated. Payment authorization approvals are recorded.

**Main Success Scenario:**

1. Customer driving the vehicle arrives at gas station to purchase gas.
2. Customer inserts a card to start a new purchase.
4. Customer selects type of the payment.
5. System get authorized with the payment.
6. Customer selects whether want a receipt.
7. Customer lifts the nozzle.
8. Customer selects the type of gas.
9. Customer begins to pump gas into the vehicle.
10. System records and display the amount and price.
11. Customer puts back the nozzle.
12. System displays the total amount and price.
13. System finalize the transaction.
14. System logs completed sale and sends sale and payment information to the external accounting system(for accounting and commissions) and Inventory system(to update inventory).
15. System presents receipt(if needed).
16. Customer leaves the gas station with gas.

**Extensions:**

2a. Customer lifts the nozzle directly.

1. System enters a suspend status.
2. System instruct customer to return the nozzle.
3. System keep doing 1 and 2 until customer returns the nozzle.

2-5a. Customer inserts an invalid card.

1. System alerts the card is invalid.
2. System instructs customer to insert a valid card.
3. System keep doing 1 and 2 until customer returns the nozzle.
