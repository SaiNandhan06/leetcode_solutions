/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode *loop1 = head;//moves at 1x
    struct ListNode *loop2 = head;//moves at 2x
    //here the list starts from given postion not from the begining
    while(loop2 != NULL && loop2->next != NULL){//loop2 moves fast and helps to check the list ends before loop1
        loop1 = loop1->next;//for traverse each node
        loop2 = loop2->next->next;//for traverse alternative node and jumps from one node to another
        if(loop1 == loop2){//if cycle exits then it meets on or before n iterations wher n is no of nodes
            return true;
        }
    }
    return false;//if cycle not exists where loop or loop->nex is null
}
