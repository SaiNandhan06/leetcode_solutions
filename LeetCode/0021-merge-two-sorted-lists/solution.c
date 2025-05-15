/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode newHead; //first need to create a normal variable because it is not globally declared
    struct ListNode *temp = &newHead;//it stores the address of newHead to traverse correctly and create a new merge sorted lists
    newHead.next = NULL;//since it is not a pointer so we use '.' product 

    while(list1 != NULL && list2 != NULL){//we  have to sort it using links , we cannot sort them just by swapping values
        if(list1->val < list2->val){
            temp->next = list1;//we need to merge the lists according to ascending order
            list1 = list1->next;//to traverse to next elemt in list1
        }else{
            temp->next = list2;
            list2 = list2->next;
        }
        temp = temp->next;
    }
    
    //connect the left over elements either in list1 or list2 fro ex: 7 elements in list1 and 3 elements in list2
    if(list1 != NULL){
        temp->next = list1;
    }else{
        temp->next = list2;
    }
    
    return newHead.next;//little confuse of not ussing newHead directly
}

