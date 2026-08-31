.class public final synthetic LR4/x2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB0/o;


# direct methods
.method public synthetic constructor <init>(ILB0/o;)V
    .locals 0

    .line 1
    iput p1, p0, LR4/x2;->q:I

    iput-object p2, p0, LR4/x2;->r:LB0/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LR4/x2;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/content/res/Configuration;

    .line 7
    .line 8
    iget-object v0, p0, LR4/x2;->r:LB0/o;

    .line 9
    .line 10
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La5/y;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La5/y;->d:Landroidx/lifecycle/J;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "it"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LR4/x2;->r:LB0/o;

    .line 35
    .line 36
    iget-object v0, v0, LB0/o;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LR4/k1;

    .line 39
    .line 40
    invoke-static {v0, p1}, LC3/a;->C(LR4/k1;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 47
    .line 48
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 62
    .line 63
    return-object p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
