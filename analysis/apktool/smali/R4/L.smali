.class public final synthetic LR4/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/O;


# direct methods
.method public synthetic constructor <init>(LR4/O;I)V
    .locals 0

    .line 1
    iput p2, p0, LR4/L;->q:I

    iput-object p1, p0, LR4/L;->r:LR4/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LR4/L;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/content/res/Configuration;

    .line 7
    .line 8
    iget-object p1, p0, LR4/L;->r:LR4/O;

    .line 9
    .line 10
    iget-object v0, p1, LR4/O;->a:LR4/k1;

    .line 11
    .line 12
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, LR4/O;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/16 v0, 0x64

    .line 37
    .line 38
    if-ne p1, v0, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, LR4/L;->r:LR4/O;

    .line 41
    .line 42
    iget-object v0, p1, LR4/O;->g:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, LR4/O;->a:LR4/k1;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v2, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    :cond_1
    iget-object v0, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, LR4/O;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p1, LR4/O;->g:Ljava/lang/String;

    .line 85
    .line 86
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
