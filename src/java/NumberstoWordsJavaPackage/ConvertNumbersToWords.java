/*
 * Document   : ConvertNumbersToWords.java
 * Created on : 13/05/2018, 6:29:35 PM
 * Author     : Michael Cartwright
 * Version    : 1.1
 */
package NumberstoWordsJavaPackage;

// For Servlet
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// For Write to File
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ConvertNumbersToWords extends HttpServlet {
    
    int pos, inputLength, limiter;
    String userInput, convertedOutput, one, two, three, four, five, six, seven, eight, nine, space, and, hundred, hypen;
    String dollars, cents, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen;
    String twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety, dollar, zero, message;
    // character 0 to 9 only and except decimal when present
    String regex = "[0-9]*[.]?[0-9]*"; // add??? |[0-9]+[.]?[0-9]+" at end. Might need * in case decimal digits are 
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
            if(inputLength == 3 || inputLength == 6)
                if(limiter == 0) {
                    andConversion();
                    limiter = 1;
                }
            pos++;
            if(userInput.charAt(pos) == '0') {
                convertedOutput = convertedOutput + ten;
            } else if(userInput.charAt(pos) == '1') {
                convertedOutput = convertedOutput + eleven;
            } else if(userInput.charAt(pos) == '2') {
                convertedOutput = convertedOutput + twelve;
            } else if(userInput.charAt(pos) == '3') {
                convertedOutput = convertedOutput + thirteen;
            } else if(userInput.charAt(pos) == '4') {
                convertedOutput = convertedOutput + fourteen;
            } else if(userInput.charAt(pos) == '5') {
                convertedOutput = convertedOutput + fifteen;
            } else if(userInput.charAt(pos) == '6') {
                convertedOutput = convertedOutput + sixteen;
            } else if(userInput.charAt(pos) == '7') {
                convertedOutput = convertedOutput + seventeen;
            } else if(userInput.charAt(pos ) == '8') {
                convertedOutput = convertedOutput + eighteen;
            } else if(userInput.charAt(pos) == '9') {
                convertedOutput = convertedOutput + nineteen;
            }
        } else if(userInput.charAt(pos) == '2') {
            andConversion();
            convertedOutput = convertedOutput + twenty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '3') {
            andConversion();
            convertedOutput = convertedOutput + thirty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '4') {
            andConversion();
            convertedOutput = convertedOutput + fourty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '5') {
            andConversion();
            convertedOutput = convertedOutput + fifty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '6') {
            andConversion();
            convertedOutput = convertedOutput + sixty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '7') {
            andConversion();
            convertedOutput = convertedOutput + seventy;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '8') {
            andConversion();
            convertedOutput = convertedOutput + eighty;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
                unitConversion();
            }
        } else if(userInput.charAt(pos) == '9') {
            andConversion();
            convertedOutput = convertedOutput + ninety;
            if(userInput.charAt(pos + 1) != '0') {
                convertedOutput = convertedOutput + hypen;
                pos++;
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
        convertedOutput = convertedOutput + space + and + space;
    }
    
    /*
     * Wipes 'output.txt' text so that output messages do not stack.
     */
    protected void wipeFile(HttpServletRequest request, HttpServletResponse response)
                               throws ServletException, IOException {
        BufferedWriter out = null;
        try {
            PrintWriter file = new PrintWriter("D:\\Documents\\NetBeansProjects\\Numbers to Words Web Page\\web\\output.txt");
            file.print("");
            file.close();
        } catch(IOException e) {
            RequestDispatcher reqdispatch = request.getRequestDispatcher("error.html");
            reqdispatch.forward(request, response);
        } finally {
            if(out != null) {
                out.close();
            }
        }
    }
    
    /*
     *
     */
    protected void writeToFile(HttpServletRequest request, HttpServletResponse response)
                               throws ServletException, IOException {
        BufferedWriter out = null;
        try {
            FileWriter file = new FileWriter("D:\\Documents\\NetBeansProjects\\Numbers to Words Web Page\\web\\output.txt", true);
            out = new BufferedWriter(file);
            out.write(message);
        } catch(IOException e) {
            RequestDispatcher reqdispatch = request.getRequestDispatcher("error.html");
            reqdispatch.forward(request, response);
        } finally {
            if(out != null) {
                out.close();
            }
        }
    }
    
    /*
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                  throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            wipeFile(request, response);
            
            // Make convertedOutput empty string to remove null
            convertedOutput = "";
            // Prevent andConversion to occur twice for userLength = 6 scenarios
            limiter = 0;
            userInput = request.getParameter("input");
            inputLength = userInput.length();
            
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
            if(userInput.equals("") || userInput == null) {
                message = "Error: No input from user or failed to read user's input";
                writeToFile(request, response);
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
            }
            // Prevent exceeding maxmium user input
            else if(inputLength > 6) {
                message = "Error: Exceeded maximum input length. 6 characters max.";
                writeToFile(request, response);
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
            }
            // Check that user input matches characters 0 - 9 and if there is a decimal
            else if(userInput.matches(regex)) {
                //Convert numbers to words
                
                /* 1. Prevent incorrect possible format inputs
                 * 2. Check length of user input
                 * 3. Concatenate outpout string and words
                 * 4. Output answer
                 */
                if(inputLength == 1) { // 1
                    if(userInput.charAt(0) == '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        unitConversion();
                        dollarsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                } else if(inputLength == 2) { // 12
                    if(userInput.charAt(0) == '.' || userInput.charAt(1) == '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        tensConversion();
                        dollarsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                } else if(inputLength == 3) { // 123
                    if(userInput.charAt(0) == '.' || userInput.charAt(1) == '.' || userInput.charAt(2) == '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        hundredsConversion();
                        pos++;
                        tensConversion();
                        dollarsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                } else if(inputLength == 4) { // 1.23
                    if(userInput.charAt(1) != '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        unitConversion();
                        dollarsConversion();
                        andConversion();
                        pos++;
                        pos++;
                        tensConversion();
                        centsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                } else if(inputLength == 5) { // 12.34
                    if(userInput.charAt(2) != '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        tensConversion();
                        dollarsConversion();
                        andConversion();
                        pos++;
                        pos++;
                        tensConversion();
                        centsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                } else if(inputLength == 6) { // 123.45
                    if(userInput.charAt(3) != '.') {
                        message = "Error: Incorrect format";
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    } else {
                        pos = 0;
                        hundredsConversion();
                        pos++;
                        tensConversion();
                        dollarsConversion();
                        andConversion();
                        pos++;
                        pos++;
                        tensConversion();
                        centsConversion();
                        // Write conversion result
                        message = convertedOutput;
                        writeToFile(request, response);
                        // Wait 3 seconds
                        Thread.sleep(3000);
                        RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                        reqdispatch.forward(request, response);
                    }
                }
            // Notify user that incorrect characters were used
            } else {
                message = "Error: Use characters '0123456789.' only";
                writeToFile(request, response);
                // Wait 3 seconds
                Thread.sleep(3000);
                RequestDispatcher reqdispatch = request.getRequestDispatcher("index.html");
                reqdispatch.forward(request, response);
            }
        } catch(Exception e) {
            RequestDispatcher reqdispatch = request.getRequestDispatcher("error.html");
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