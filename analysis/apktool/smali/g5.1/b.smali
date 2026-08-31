.class public final Lg5/b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lg5/c;

.field public final synthetic b:LU4/i;


# direct methods
.method public constructor <init>(Lg5/c;LU4/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/b;->a:Lg5/c;

    .line 2
    .line 3
    iput-object p2, p0, Lg5/b;->b:LU4/i;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "ctxt"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "intent"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lg5/b;->a:Lg5/c;

    .line 12
    .line 13
    iput-object p2, p1, Lg5/c;->f:Landroid/content/Intent;

    .line 14
    .line 15
    iget-object p1, p1, Lg5/c;->d:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lg5/b;->b:LU4/i;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, LU4/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
