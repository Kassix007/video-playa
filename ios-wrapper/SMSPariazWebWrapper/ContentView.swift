import SwiftUI

struct ContentView: View {
    @StateObject private var browser = BrowserState()

    var body: some View {
        NavigationStack {
            SMSPariazWebView(state: browser)
                .navigationTitle(browser.title.isEmpty ? "SMSPariaz" : browser.title)
                .navigationBarTitleDisplayMode(.inline)
                .toolbar {
                    ToolbarItemGroup(placement: .bottomBar) {
                        Button {
                            browser.goBack?()
                        } label: {
                            Label("Back", systemImage: "chevron.backward")
                        }
                        .disabled(!browser.canGoBack)

                        Button {
                            browser.goForward?()
                        } label: {
                            Label("Forward", systemImage: "chevron.forward")
                        }
                        .disabled(!browser.canGoForward)

                        Spacer()

                        if browser.isLoading {
                            ProgressView()
                        }

                        Button {
                            browser.reload?()
                        } label: {
                            Label("Reload", systemImage: "arrow.clockwise")
                        }
                    }
                }
        }
    }
}

@MainActor
final class BrowserState: ObservableObject {
    @Published var title = ""
    @Published var canGoBack = false
    @Published var canGoForward = false
    @Published var isLoading = false

    var goBack: (() -> Void)?
    var goForward: (() -> Void)?
    var reload: (() -> Void)?
}
