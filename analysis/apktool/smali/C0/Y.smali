.class public final LC0/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/E;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/Y;->a:I

    iput-object p2, p0, LC0/Y;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LC0/Y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu/v0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lu/v0;->i()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lu/v0;->a:LO3/D0;

    .line 14
    .line 15
    invoke-virtual {v0}, LO3/D0;->n()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lc/h;

    .line 22
    .line 23
    invoke-virtual {v0}, Lb/u;->e()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lc/b;

    .line 30
    .line 31
    invoke-virtual {v0}, Lb/u;->e()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La1/j;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, La1/j;->w:La1/h;

    .line 43
    .line 44
    iget-object v1, v0, LC0/a;->s:LC0/w1;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, LC0/w1;->d()V

    .line 49
    .line 50
    .line 51
    :cond_0
    const/4 v1, 0x0

    .line 52
    iput-object v1, v0, LC0/a;->s:LC0/w1;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_3
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, LM/M;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, LM/M;->w:LM/K;

    .line 66
    .line 67
    iget-object v1, v0, LC0/a;->s:LC0/w1;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, LC0/w1;->d()V

    .line 72
    .line 73
    .line 74
    :cond_1
    const/4 v1, 0x0

    .line 75
    iput-object v1, v0, LC0/a;->s:LC0/w1;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_4
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, LE/G;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    iput-boolean v1, v0, LE/G;->f:Z

    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_5
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, LE/K;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    iput-object v1, v0, LE/K;->c:LB0/G0;

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_6
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, LE/t;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    iput-object v1, v0, LE/t;->d:LX/e;

    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_7
    iget-object v0, p0, LC0/Y;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, LC0/w0;

    .line 108
    .line 109
    iget-object v0, v0, LC0/w0;->a:LC0/y0;

    .line 110
    .line 111
    invoke-virtual {v0}, LC0/y0;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
