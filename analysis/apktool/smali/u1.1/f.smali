.class public abstract Lu1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc4/c;

.field public static final b:Lc4/c;

.field public static final c:Lc4/c;

.field public static final d:Lc4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lc4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lc4/c;-><init>(Lu1/e;Z)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu1/f;->a:Lc4/c;

    .line 9
    .line 10
    new-instance v0, Lc4/c;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v1, v3}, Lc4/c;-><init>(Lu1/e;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lu1/f;->b:Lc4/c;

    .line 17
    .line 18
    new-instance v0, Lc4/c;

    .line 19
    .line 20
    sget-object v1, Lu1/e;->a:Lu1/e;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lc4/c;-><init>(Lu1/e;Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lu1/f;->c:Lc4/c;

    .line 26
    .line 27
    new-instance v0, Lc4/c;

    .line 28
    .line 29
    invoke-direct {v0, v1, v3}, Lc4/c;-><init>(Lu1/e;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lu1/f;->d:Lc4/c;

    .line 33
    .line 34
    return-void
.end method
