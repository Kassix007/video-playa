.class public final LH2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LM5/h;


# direct methods
.method public synthetic constructor <init>(LM5/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LH2/c;->q:I

    iput-object p1, p0, LH2/c;->r:LM5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    iget p1, p0, LH2/c;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LH2/c;->r:LM5/h;

    .line 7
    .line 8
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, LH2/c;->r:LM5/h;

    .line 15
    .line 16
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
