.class public final LO3/X0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LO3/J0;

.field public final synthetic s:J

.field public final synthetic t:Z

.field public final synthetic u:LO3/b1;


# direct methods
.method public synthetic constructor <init>(LO3/b1;LO3/J0;JZI)V
    .locals 0

    .line 1
    iput p6, p0, LO3/X0;->q:I

    iput-object p2, p0, LO3/X0;->r:LO3/J0;

    iput-wide p3, p0, LO3/X0;->s:J

    iput-boolean p5, p0, LO3/X0;->t:Z

    iput-object p1, p0, LO3/X0;->u:LO3/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LO3/X0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/X0;->u:LO3/b1;

    .line 7
    .line 8
    iget-object v1, p0, LO3/X0;->r:LO3/J0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LO3/b1;->s(LO3/J0;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v2, p0, LO3/X0;->t:Z

    .line 14
    .line 15
    iget-wide v3, p0, LO3/X0;->s:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v3, v4, v2}, LO3/b1;->D(LO3/J0;JZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, LO3/X0;->u:LO3/b1;

    .line 22
    .line 23
    iget-object v1, p0, LO3/X0;->r:LO3/J0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LO3/b1;->s(LO3/J0;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, LO3/X0;->t:Z

    .line 29
    .line 30
    iget-wide v3, p0, LO3/X0;->s:J

    .line 31
    .line 32
    invoke-virtual {v0, v1, v3, v4, v2}, LO3/b1;->D(LO3/J0;JZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
