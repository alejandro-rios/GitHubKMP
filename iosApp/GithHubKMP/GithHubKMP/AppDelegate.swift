//
//  AppDelegate.swift
//  GithHubKMP
//
//  Created by Alejandro Rios on 7/24/19.
//  Copyright © 2019 Alejandro Rios. All rights reserved.
//

import UIKit
import shared

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    
    public lazy var dataRepository = { MembersDataRepository(api: GitHubAPI()) }()

    var window: UIWindow?
    
    static var appDelegate: AppDelegate {
        return UIApplication.shared.delegate as! AppDelegate
    }
}
