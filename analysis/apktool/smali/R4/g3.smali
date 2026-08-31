.class public final synthetic LR4/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LR4/g3;->q:I

    iput-object p2, p0, LR4/g3;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget p1, p0, LR4/g3;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LR4/g3;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LI2/e;

    .line 9
    .line 10
    invoke-virtual {p1}, LI2/e;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, LR4/g3;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lk3/c;

    .line 17
    .line 18
    iget-object p1, p1, Lk3/c;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/webkit/HttpAuthHandler;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/webkit/HttpAuthHandler;->cancel()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
