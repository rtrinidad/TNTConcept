/*
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This javascript include file is required for <wcf:scroller/>.
 * include this script once into your jsp and add <wcf:scroller/> to any
 * form on that page.
 */

/**
 * Listens to user interaction and stores the current scroll position
 * in hidden fields in any form on the page that contains a <wcf:scroller/> tag.
 */
function xScrollerGetCoords()
{
  var scrollX, scrollY;
  var i;

  if (document.all)
  {
     if (document.documentElement.scrollLeft) {
        scrollX = document.documentElement.scrollLeft;
     }
     else {
        scrollX = document.body.scrollLeft;
     }

     if (document.documentElement.scrollTop) {
        scrollY = document.documentElement.scrollTop;
     }
     else {
        scrollY = document.body.scrollTop;
     }
  }
  else
  {
     scrollX = window.pageXOffset;
     scrollY = window.pageYOffset;
  }

  for(i=0; i<document.forms.length; i++) {
    if(document.forms[i].wcfXCoord && document.forms[i].wcfYCoord) {
      document.forms[i].wcfXCoord.value = scrollX;
      document.forms[i].wcfYCoord.value = scrollY;
    }
  }
}

/**
 * Scrolls the browser window to the position that is stored in the hidden fields
 */
function xScrollerScroll()
{
  var i;

  for(i=0; i<document.forms.length; i++) {
    if(document.forms[i].wcfXCoord && document.forms[i].wcfYCoord) {
      var x = document.forms[i].wcfXCoord.value;
      var y = document.forms[i].wcfYCoord.value;
      window.scrollTo(x, y);
    }
  }
}

/**
 * Registers browser window event listeners
 */
window.onload = xScrollerScroll;
window.onscroll = xScrollerGetCoords;
window.onkeypress = xScrollerGetCoords;
window.onclick = xScrollerGetCoords;
