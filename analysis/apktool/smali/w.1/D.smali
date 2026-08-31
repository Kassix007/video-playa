.class public abstract Lw/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le3/u;

.field public static final b:Le3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le3/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v2, v3, v1}, Le3/u;-><init>(ILq5/c;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lw/D;->a:Le3/u;

    .line 10
    .line 11
    new-instance v0, Le3/u;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, v2, v3, v1}, Le3/u;-><init>(ILq5/c;I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lw/D;->b:Le3/u;

    .line 18
    .line 19
    return-void
.end method
