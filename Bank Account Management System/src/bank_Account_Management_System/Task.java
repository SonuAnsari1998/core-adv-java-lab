package bank_Account_Management_System;

/*

JAVA MAP INTERFACE – BANK ACCOUNT MANAGEMENT SYSTEM

INSTRUCTIONS:
- This is a SINGLE comprehensive question.
- Answer in detail using Java concepts.
- Do NOT write complete code unless explicitly asked.
- Focus on design, logic, validations, edge cases, and Map usage.
- Explain your decisions clearly.

------------------------------------------------------------------

QUESTION:

A national-level bank is planning to build a core banking module called
“Bank Account Management System” using Java.

The system must efficiently handle thousands of customer accounts and
should be designed using the Java Map interface along with proper
Object-Oriented Programming principles.

Each bank account has the following attributes:
- Account Number (unique and mandatory)
- Account Holder Name
- Account Type (Savings / Current)
- Balance

The bank decides the following design rule:
- Account Number will be used as the KEY
- Account Object will be stored as the VALUE
- All accounts must be stored in a Map collection

------------------------------------------------------------------

FUNCTIONAL REQUIREMENTS:

The system must support the following operations:

1. Account Creation
- Add a new account to the system.
- Initial balance must be validated.
- Duplicate account numbers must not be allowed.
- Account number once created cannot be changed.

2. Deposit Operation
- Deposit money into an existing account.
- Deposit amount must be greater than zero.
- Deposit should immediately update the balance.
- Deposits to non-existing accounts must be handled gracefully.

3. Withdrawal Operation
- Withdraw money from an account.
- Withdrawal should be allowed only if sufficient balance is available.
- Account balance should never become negative.
- Withdrawal attempts on invalid accounts must be handled.

4. Account Search
- Search account details using account number.
- Display complete account information if found.
- Display an appropriate message if account does not exist.

5. Display All Accounts
- Display all accounts stored in the system.
- Output should be readable and well-formatted.
- Explain how iteration over Map is performed.

------------------------------------------------------------------

DESIGN & ANALYSIS REQUIREMENTS:

While answering, explain in detail:

- Which Map implementation will you choose and why?
- Why Map is more suitable than List for this system?
- How key-value mapping helps in fast account lookup?
- Time complexity of add, search, deposit, and withdrawal operations.
- How duplicate keys are handled internally by Map.
- Where business logic (deposit/withdraw) should reside and why.
- How the design follows real-world banking rules.

------------------------------------------------------------------

EDGE CASES TO HANDLE:

- Adding account with zero balance
- Adding account with negative balance
- Deposit with zero or negative amount
- Withdrawal with exact available balance
- Withdrawal amount greater than balance
- Operations on non-existing account numbers
- Attempt to add duplicate account numbers
- Empty Map scenario while displaying accounts

------------------------------------------------------------------

TEST CASE SCENARIOS:

Consider the following test cases while explaining your solution:

1. Create account:
   Account No: 1001, Name: Rahul, Type: Savings, Balance: 5000

2. Create account:
   Account No: 1002, Name: Anita, Type: Current, Balance: 0

3. Attempt to create account:
   Account No: 1001 again (duplicate)

4. Deposit:
   Deposit 2000 into account 1001

5. Deposit:
   Deposit -500 into account 1001

6. Withdraw:
   Withdraw 3000 from account 1001

7. Withdraw:
   Withdraw 5000 from account 1001

8. Withdraw:
   Withdraw from non-existing account 9999

9. Search:
   Search account 1002

10. Display:
    Display all accounts after above operations

------------------------------------------------------------------

EXPECTED OUTCOME:

Your answer should clearly demonstrate:
- Strong understanding of Java Map interface
- Proper use of key-value design
- Real-world problem-solving ability
- Handling of validations and edge cases
- Interview-level depth and clarity

------------------------------------------------------------------
END OF QUESTION
*/
