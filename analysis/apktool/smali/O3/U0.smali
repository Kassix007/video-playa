.class public final LO3/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:J

.field public final synthetic t:Landroid/os/Bundle;

.field public final synthetic u:Z

.field public final synthetic v:Z

.field public final synthetic w:Z

.field public final synthetic x:LO3/b1;


# direct methods
.method public constructor <init>(LO3/b1;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LO3/U0;->q:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, LO3/U0;->r:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p4, p0, LO3/U0;->s:J

    .line 9
    .line 10
    iput-object p6, p0, LO3/U0;->t:Landroid/os/Bundle;

    .line 11
    .line 12
    iput-boolean p7, p0, LO3/U0;->u:Z

    .line 13
    .line 14
    iput-boolean p8, p0, LO3/U0;->v:Z

    .line 15
    .line 16
    iput-boolean p9, p0, LO3/U0;->w:Z

    .line 17
    .line 18
    iput-object p1, p0, LO3/U0;->x:LO3/b1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-boolean v7, p0, LO3/U0;->v:Z

    .line 2
    .line 3
    iget-boolean v8, p0, LO3/U0;->w:Z

    .line 4
    .line 5
    iget-object v0, p0, LO3/U0;->x:LO3/b1;

    .line 6
    .line 7
    iget-object v1, p0, LO3/U0;->q:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LO3/U0;->r:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v3, p0, LO3/U0;->s:J

    .line 12
    .line 13
    iget-object v5, p0, LO3/U0;->t:Landroid/os/Bundle;

    .line 14
    .line 15
    iget-boolean v6, p0, LO3/U0;->u:Z

    .line 16
    .line 17
    invoke-virtual/range {v0 .. v8}, LO3/b1;->x(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
