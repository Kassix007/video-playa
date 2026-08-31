.class public final LU4/M;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/M;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LU4/M;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU4/M;->s:LP/W;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LU4/M;

    .line 2
    .line 3
    iget-object v0, p0, LU4/M;->r:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, LU4/M;->s:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, LU4/M;->q:LR4/k1;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU4/M;-><init>(LR4/k1;LP/W;LP/W;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/M;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/M;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/M;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/M;->r:LP/W;

    .line 5
    .line 6
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0xc8

    .line 17
    .line 18
    if-le v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LU4/M;->q:LR4/k1;

    .line 21
    .line 22
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance v2, LU4/L;

    .line 27
    .line 28
    iget-object v3, p0, LU4/M;->s:LP/W;

    .line 29
    .line 30
    invoke-direct {v2, v0, p1, v3}, LU4/L;-><init>(LR4/k1;LP/W;LP/W;)V

    .line 31
    .line 32
    .line 33
    const-string p1, "(function() {var activeElement = document.activeElement;if(activeElement) {   var rect = activeElement.getBoundingClientRect();   return rect.bottom;} else {   return -1;}})()"

    .line 34
    .line 35
    invoke-virtual {v1, p1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1
.end method
