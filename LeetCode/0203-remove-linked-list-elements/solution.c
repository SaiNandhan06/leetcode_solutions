/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    //just to simplify whether head have the value or not
    while (head != NULL && head->val == val) {
        struct ListNode* to_delete = head;//to free the head using pointer without any complexity
        head = head->next;
        free(to_delete);
    }

    struct ListNode* temp = head;
    while (temp != NULL && temp->next != NULL) {// to check both last element and check the last before element 
        if (temp->next->val == val) {//checking next element val for easy execution 
            struct ListNode* to_delete = temp->next;
            temp->next = temp->next->next;
            free(to_delete);
        } else {
            temp = temp->next;
        }
    }

    return head;
}

