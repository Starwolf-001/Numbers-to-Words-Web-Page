/*
 * Document   : ConvertNumbersToWords.java
 * Created on : 12/05/2018, 7:51:00 PM
 * Author     : Michael Cartwright
 * Version    : 1.0
 */
package NumberstoWordsJavaPackage;

// For Java Servlet
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConvertNumbersToWords extends HttpServlet {
    
    int pos;
    
    String userInput, convertedOutput, one, two, three, four, five, six, seven, eight, nine, space, and, hundred, hypen;
    String dollars, cents, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen;
    String twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety, dollar, zero;
    // character 0 to 9 only and except decimal when present
    String regex = "[0-9]+[.]?[0-9]+"; // add??? |[0-9]+[.]?[0-9]+" at end. Might need * in case decimal digits are 
                                       // required regardless of decimal present
    /*
     *
     */
    protected void unitConversion() {
        if(userInput.charAt(pos) == '0') {
            convertedOutput = convertedOutput + zero;
        } else if(userInput.charAt(pos) == '1') {
            convertedOutput = convertedOutput + one;
        } else if(userInput.charAt(pos) == '2') {
            convertedOutput = convertedOutput + two;
        } else if(userInput.charAt(pos) == '3') {
            convertedOutput = convertedOutput + three;
        } else if(userInput.charAt(pos) == '4') {
            convertedOutput = convertedOutput + four;
        } else if(userInput.charAt(pos) == '5') {
            convertedOutput = convertedOutput + five;
        } else if(userInput.charAt(pos) == '6') {
            convertedOutput = convertedOutput + six;
        } else if(userInput.charAt(pos) == '7') {
            convertedOutput = convertedOutput + seven;
        } else if(userInput.charAt(pos) == '8') {
            convertedOutput = convertedOutput + eight;
        } else if(userInput.charAt(pos) == '9') {
            convertedOutput = convertedOutput + nine;
        }
    }
    
    /*
     *
     */
    protected void tensConversion() {
        if(userInput.charAt(pos) == '1') {
            if(userInput.charAt(pos + 1) == '0') {
                convertedOutput = convertedOutput + ten;
            } else if(userInput.charAt(pos + 1) == '1') {
                convertedOutput = convertedOutput + eleven;
            } else if(userInput.charAt(pos + 1) == '2') {
                convertedOutput = convertedOutput + twelve;
            } else if(userInput.charAt(pos + 1) == '3') {
                convertedOutput = convertedOutput + thirteen;
            } else if(userInput.charAt(pos + 1) == '4') {
                convertedOutput = convertedOutput + fourteen;
            } else if(userInput.charAt(pos + 1) == '5') {
                convertedOutput = convertedOutput + fifteen;
            } else if(userInput.charAt(pos + 1) == '6') {
                convertedOutput = convertedOutput + sixteen;
            } else if(userInput.charAt(pos + 1) == '7') {
                convertedOutput = convertedOutput + seventeen;
            } else if(userInput.charAt(pos + 1) == '8') {
                convertedOutput = convertedOutput + eighteen;
            } else if(userInput.charAt(pos + 1) == '9') {
                convertedOutput = convertedOutput + nineteen;
            }
        } else if(userInput.charAt(pos) == '2') {
            convertedOutput = convertedOutput + twenty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '3') {
            convertedOutput = convertedOutput + thirty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '4') {
            convertedOutput = convertedOutput + fourty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '5') {
            convertedOutput = convertedOutput + fifty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '6') {
            convertedOutput = convertedOutput + sixty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '7') {
            convertedOutput = convertedOutput + seventy;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '8') {
            convertedOutput = convertedOutput + eighty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '9') {
            convertedOutput = convertedOutput + ninety;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                unitConversion();
            }
        }
    }
    
    /*
     *
     */
    protected void hundredsConversion() {
        if(userInput.charAt(pos) == '1') {
            convertedOutput = convertedOutput + one + space + hundred;
        } else if(userInput.charAt(pos) == '2') {
            convertedOutput = convertedOutput + two + space + hundred;;
        } else if(userInput.charAt(pos) == '3') {
            convertedOutput = convertedOutput + three + space + hundred;;
        } else if(userInput.charAt(pos) == '4') {
            convertedOutput = convertedOutput + four + space + hundred;;
        } else if(userInput.charAt(pos) == '5') {
            convertedOutput = convertedOutput + five + space + hundred;;
        } else if(userInput.charAt(pos) == '6') {
            convertedOutput = convertedOutput + six + space + hundred;;
        } else if(userInput.charAt(pos) == '7') {
            convertedOutput = convertedOutput + seven + space + hundred;;
        } else if(userInput.charAt(pos) == '8') {
            convertedOutput = convertedOutput + eight + space + hundred;;
        } else if(userInput.charAt(pos) == '9') {
            convertedOutput = convertedOutput + nine + space + hundred;;
        }
    }
    
    /*
     *
     */
    protected void decimalConversion() {
        convertedOutput = convertedOutput + space + and;
    }
    
    /*
     *
     */
    protected void dollarConversion() {
        convertedOutput = convertedOutput + space + dollar;
    }
    
    /*
     *
     */
    protected void dollarsConversion() {
        convertedOutput = convertedOutput + space + dollars;
    }
    
    /*
     *
     */
    protected void centsConversion() {
        convertedOutput = convertedOutput + space + cents;
    }
    
    /*
     *
     */
    protected void andConversion() {
        convertedOutput = convertedOutput + space + and;
    }
    
    /*
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                  throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            userInput = request.getParameter("input");
            int inputLength = userInput.length();
            
            // <editor-fold defaultstate="collapsed" desc="Conversion String components">
            one = "ONE";
            two = "TWO";
            three = "THREE";
            four = "FOUR";
            five = "FIVE";
            six = "SIX";
            seven = "SEVEN";
            eight = "EIGHT";
            nine = "NINE";
            space = " ";
            and = "AND";
            hundred = "HUNDRED";
            hypen = "-";
            dollars = "DOLLARS";
            cents = "CENTS";
            ten = "TEN";
            eleven = "ELEVEN";
            twelve = "TWELVE";
            thirteen = "THIRTEEN";
            fourteen = "FOURTEEN";
            fifteen = "FIFTEEN";
            sixteen = "SIXTEEN";
            seventeen = "SEVENTEEN";
            eighteen = "EIGHTEEN";
            nineteen = "NINETEEN";
            twenty = "TWENTY";
            thirty = "THIRTY";
            fourty = "FOURTY";
            fifty = "FIFTY";
            sixty = "SIXTY";
            seventy = "SEVENTY";
            eighty = "EIGHTY";
            ninety = "NINETY";
            dollar = "DOLLAR";
            zero = "ZERO"; // </editor-fold>
            
            // If the user inputs an empty string or there was an error return to index.
            if(userInput.equals("")) {
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
                //TODO report convertOutput = "Error: empty input";
            }
            // Prevent exceeding maxmium user input
            if(inputLength > 6) {
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
                //TODO report convertOutput = "Error: exceeds maximum input";
            }
            // Check that user input matches characters 0 - 9 and if there is a decimal
            if(userInput.matches(regex)) {
                //Convert numbers to words
                
                /* 1. Prevent incorrect possible format inputs
                 * 2. Check length of user input
                 * 3. Concatenate outpout string and words
                 * 4. Output answer
                 */
                if(inputLength == 1) { // 1
                    if(userInput.charAt(0) == '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    } else {
                        
                    }
                } else if(inputLength == 2) { // 12
                    if(userInput.charAt(0) == '.' || userInput.charAt(1) == '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    } else {

                    }
                } else if(inputLength == 3) { // 123
                    if(userInput.charAt(0) == '.' || userInput.charAt(1) == '.' || userInput.charAt(2) == '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    }
                } else if(inputLength == 4) { // 1.23
                    if(userInput.charAt(1) != '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    }
                } else if(inputLength == 5) { // 12.34
                    if(userInput.charAt(2) != '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    }
                } else if(inputLength == 6) { // 123.45
                    if(userInput.charAt(3) != '.') {
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                        //TODO report convertOutput = "Error: incorrect format";
                    }
                }
                
                //for(int pos = 0; pos < inputLength; pos++) {
                //    if(userInput.charAt(pos) == '1') {
                //        
                //   }
                //}
            } else {
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
                //TODO report convertOutput = "Error: use characters 0123456789. only";
            }
        } catch(Exception e) {
            RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
            reqdispatch.forward(request, response);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}