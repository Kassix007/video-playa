import SwiftUI

struct ContentView: View {
    @StateObject private var webViewModel = WebViewModel()
    private let apiClient = APIClient()

    var body: some View {
        NavigationStack {
            SMSPariazWebView(
                url: URL(string: "https://www.smspariaz.com")!,
                model: webViewModel,
                apiClient: apiClient
            )
            .navigationTitle("SMSPariaz Prototype")
            .navigationBarTitleDisplayMode(.inline)
            .safeAreaInset(edge: .bottom) {
                VStack(spacing: 8) {
                    Text(webViewModel.statusMessage)
                        .font(.caption)
                        .foregroundStyle(.secondary)
                        .frame(maxWidth: .infinity, alignment: .leading)

                    HStack {
                        Button("Back", action: webViewModel.goBack)
                            .disabled(!webViewModel.canGoBack)
                        Button("Forward", action: webViewModel.goForward)
                            .disabled(!webViewModel.canGoForward)
                        Spacer()
                        Button("Reload", action: webViewModel.reload)
                    }
                }
                .padding()
                .background(.bar)
            }
        }
    }
}

