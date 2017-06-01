/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// button onMouseDoun handler
function MouseDown(obj){
    obj.style.borderLeftColor="#666";
    obj.style.borderTopColor="#666";
    obj.style.borderRightColor="#FFF";
    obj.style.borderBottomColor="#FFF";
}

// button onMouseUp handler
function MouseUp(obj){
    obj.style.borderLeftColor="#FFF";
    obj.style.borderTopColor="#FFF";
    obj.style.borderRightColor="#666";
    obj.style.borderBottomColor="#666";
}

// button onMouseOver handler
function MouseOver(obj) {
    obj.style.color="#000";
    obj.style.backgroundColor= "#DCF";
}

// button onMouseOut handler
function MouseOut(obj) {
    obj.style.color="#fff";
    obj.style.borderLeftColor="#FFF";
    obj.style.borderTopColor="#FFF";
    obj.style.borderRightColor="#666";
    obj.style.borderBottomColor="#666";
    obj.style.backgroundColor= "#19aa39";
}