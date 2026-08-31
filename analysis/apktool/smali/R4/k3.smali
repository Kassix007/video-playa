.class public final synthetic LR4/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/l3;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(LR4/l3;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LR4/k3;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/k3;->r:LR4/l3;

    iput-boolean p2, p0, LR4/k3;->s:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLR4/l3;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LR4/k3;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LR4/k3;->s:Z

    iput-object p2, p0, LR4/k3;->r:LR4/l3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, LR4/k3;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/k3;->r:LR4/l3;

    .line 7
    .line 8
    iget-object v1, v0, LR4/l3;->a:LR4/k1;

    .line 9
    .line 10
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 20
    .line 21
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/webkit/WebView;->clearHistory()V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, LR4/k3;->s:Z

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_0
    iget-boolean v0, p0, LR4/k3;->s:Z

    .line 54
    .line 55
    iget-object v1, p0, LR4/k3;->r:LR4/l3;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, v1, LR4/l3;->a:LR4/k1;

    .line 61
    .line 62
    iget-object v0, v0, LR4/k1;->w:Lb4/e;

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v1, LR4/l3;->a:LR4/k1;

    .line 71
    .line 72
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Lj5/d;->d(Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget-object v0, v1, LR4/l3;->a:LR4/k1;

    .line 80
    .line 81
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    const/4 v1, 0x0

    .line 91
    :goto_0
    iput-object v1, v0, LR4/k1;->x:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, v0, LR4/k1;->t:Lj5/d;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lj5/d;->d(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, LR4/k1;->w:Lb4/e;

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const/16 v1, 0x8

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
