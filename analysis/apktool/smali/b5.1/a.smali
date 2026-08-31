.class public final synthetic Lb5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnScrollChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LR4/k1;


# direct methods
.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/a;->a:I

    iput-object p1, p0, Lb5/a;->b:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChange(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    iget p1, p0, Lb5/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb5/a;->b:LR4/k1;

    .line 7
    .line 8
    iget-boolean p2, p1, LR4/k1;->a0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iput p3, p1, LR4/k1;->Z:I

    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Lb5/a;->b:LR4/k1;

    .line 16
    .line 17
    iget-boolean p2, p1, LR4/k1;->a0:Z

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iput p3, p1, LR4/k1;->Z:I

    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
