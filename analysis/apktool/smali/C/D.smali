.class public abstract LC/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC/s;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v5, LC/B;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, v0}, LC/B;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 8
    .line 9
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/measurement/I1;->B()LW0/d;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-static {v0, v0, v1}, LW0/b;->b(III)J

    .line 21
    .line 22
    .line 23
    move-result-wide v10

    .line 24
    new-instance v0, LC/s;

    .line 25
    .line 26
    const/16 v17, 0x0

    .line 27
    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    sget-object v12, Ln5/s;->q:Ln5/s;

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    const/4 v14, 0x0

    .line 40
    const/4 v15, 0x0

    .line 41
    sget-object v16, Lw/d0;->q:Lw/d0;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v18}, LC/s;-><init>(LC/t;IZFLz0/D;FZLM5/w;LW0/c;JLjava/util/List;IIILw/d0;II)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LC/D;->a:LC/s;

    .line 47
    .line 48
    return-void
.end method
