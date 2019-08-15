//
//  MemberList.swift
//  GithHubKMP
//
//  Created by Alejandro Rios on 8/7/19.
//  Copyright © 2019 Alejandro Rios. All rights reserved.
//

import Foundation
import shared

class MemberList {
    var members: [Member] = []
    
    func updateMembers( newMembers: [Member]) {
        members.removeAll()
        members.append(contentsOf: newMembers)
    }
}
