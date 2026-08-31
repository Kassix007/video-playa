.class public final LC2/g;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:LB0/G0;


# direct methods
.method public constructor <init>(LB0/G0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/g;->a:LB0/G0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/g;->a:LB0/G0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, v1}, LB0/G0;->g(LB0/G0;Landroid/net/Network;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/g;->a:LB0/G0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, LB0/G0;->g(LB0/G0;Landroid/net/Network;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
