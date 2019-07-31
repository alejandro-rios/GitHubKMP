//
//  ViewController.swift
//  GithHubKMP
//
//  Created by Alejandro Rios on 7/24/19.
//  Copyright © 2019 Alejandro Rios. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController, MembersView {
    
    lazy var presenter: MembersPresenter = {
        MembersPresenter(view: self, repository: AppDelegate.appDelegate.dataRepository)
    }()
    
    var isUpdating = false

    @IBOutlet weak var txtGreeting: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        txtGreeting.text = Greeting().greeting()
    }
    
    override func viewWillAppear(_ animated: Bool) {
        presenter.onCreate()
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        presenter.onDestroy()
    }
    
    func onUpdate(members: String) {
        print(members)
    }
}

