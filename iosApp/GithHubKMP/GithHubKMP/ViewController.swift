//
//  ViewController.swift
//  GithHubKMP
//
//  Created by Alejandro Rios on 7/24/19.
//  Copyright © 2019 Alejandro Rios. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    @IBOutlet weak var txtGreeting: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        txtGreeting.text = Greeting().greeting()
    }
}

